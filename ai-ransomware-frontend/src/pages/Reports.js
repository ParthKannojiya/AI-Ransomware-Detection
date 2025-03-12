function Reports() {
  return (
    <div className="reports-container">
      <h1>📊 Reports Dashboard</h1>
      <p>View security reports and ransomware analysis here.</p>

      {/* Sample Report Data */}
      <div className="report-box">
        <h2>🛡️ Security Analysis</h2>
        <p>Latest ransomware threats detected in the past 24 hours.</p>
      </div>
      <div className="report-box">
        <h2>📉 Risk Assessment</h2>
        <p>System vulnerabilities and recommended security fixes.</p>
      </div>
    </div>
  );
}

export default Reports;
