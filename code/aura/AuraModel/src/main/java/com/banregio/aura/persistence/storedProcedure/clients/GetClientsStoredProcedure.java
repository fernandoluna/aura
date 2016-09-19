package com.banregio.aura.persistence.storedProcedure.clients;

import com.banregio.aura.utils.AuraUtilsMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import java.sql.Types;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Stored Procedure for get aura clients
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

public class GetClientsStoredProcedure extends StoredProcedure {

  /**
   * Constructor class set parameters for Stored procedure
   *
   * @param jdbcTemplate contains the connection for DB
   */
  public GetClientsStoredProcedure(JdbcTemplate jdbcTemplate) {
    super(jdbcTemplate, AuraUtilsMapper.STORED_PROCEDURE_GET_CLIENT);



    //@tipo_consulta_param
    declareParameter(new SqlParameter(AuraUtilsMapper.PARAMETER_APPLICATION_QUERY_TYPE_PARAM, Types.VARCHAR));

    //@usuario_creacion_param
    declareParameter(new SqlParameter(AuraUtilsMapper.USER_CREATE_PARAM, Types.VARCHAR));
    //@fecha_creacion_param
    declareParameter(new SqlParameter(AuraUtilsMapper.DATE_CREATE_PARAM, Types.DATE));
    //@usuario_ultima_modificacion_param
    declareParameter(new SqlParameter(AuraUtilsMapper.USER_LAST_MODIFICATION_PARAM, Types.VARCHAR));
    //@fecha_ultima_modificacion_param
    declareParameter(new SqlParameter(AuraUtilsMapper.DATE_LAST_MODIFICATION_PARAM, Types.DATE));
    //@numero_tarea_param
    declareParameter(new SqlParameter(AuraUtilsMapper.TASK_NUMBER_PARAM, Types.VARCHAR));
    //@sucursal_param
    declareParameter(new SqlParameter(AuraUtilsMapper.BRANCH_OFFICE_PARAM, Types.VARCHAR));
  }

  /**
   * Get client list
   *
   * @param queryType identify the fetch type filter
   * @param userCreated identify the user to create register
   * @param dateCreated identify the date to add the register
   * @param userUpdated identify the user to modify the register
   * @param dateUpdated identify the date modify register
   * @param taskNumber identify the task id
   * @param branchOffice identify the branchOffice to register city
   * @return result set
   */
  public Map<String, Object> getClients(final String queryType, final String userCreated, final Date dateCreated, final String userUpdated, final Date dateUpdated, final String taskNumber, final String branchOffice){
    Map<String, Object> initParameters = new HashMap<String, Object>();

    //@tipo_consulta_param
    initParameters.put(AuraUtilsMapper.PARAMETER_APPLICATION_QUERY_TYPE_PARAM, queryType);

    //@usuario_creacion_param
    initParameters.put(AuraUtilsMapper.USER_CREATE_PARAM, userCreated);
    //@fecha_creacion_param
    initParameters.put(AuraUtilsMapper.DATE_CREATE_PARAM, dateCreated);
    //@usuario_ultima_modificacion_param
    initParameters.put(AuraUtilsMapper.USER_LAST_MODIFICATION_PARAM, userUpdated);
    //@fecha_ultima_modificacion_param
    initParameters.put(AuraUtilsMapper.DATE_LAST_MODIFICATION_PARAM, dateUpdated);
    //@numero_tarea_param
    initParameters.put(AuraUtilsMapper.TASK_NUMBER_PARAM, taskNumber);
    //@sucursal_param
    initParameters.put(AuraUtilsMapper.BRANCH_OFFICE_PARAM, branchOffice);

    return execute(initParameters);
  }
}
